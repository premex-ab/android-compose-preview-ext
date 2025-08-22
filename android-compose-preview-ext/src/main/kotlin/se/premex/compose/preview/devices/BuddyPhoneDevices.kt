package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BUDDY_PHONE device specifications for Android Compose previews.
 *
 * This extension provides BUDDY_PHONE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BuddyPhone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BuddyPhone: Any
  get() = object {
      /** BUDDY_PHONE BP */
      val BP = "spec:width=600,height=1280,unit=px,dpi=240"

      /** BUDDY_PHONE P2 */
      val P2 = "spec:width=480,height=960,unit=px,dpi=240"

  }
