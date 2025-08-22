package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * YOSHIRO device specifications for Android Compose previews.
 *
 * This extension provides YOSHIRO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yoshiro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yoshiro: Any
  get() = object {
      /** YOSHIRO R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** YOSHIRO R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
