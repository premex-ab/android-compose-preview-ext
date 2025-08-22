package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Starmobile device specifications for Android Compose previews.
 *
 * This extension provides Starmobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Starmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Starmobile: Any
  get() = object {
      /** Starmobile PLAY_Click_LTE */
      val PLAY_CLICK_LTE = "spec:width=480,height=960,unit=px,dpi=240"

      /** Starmobile UP_Prime */
      val UP_PRIME = "spec:width=720,height=1280,unit=px,dpi=320"

  }
