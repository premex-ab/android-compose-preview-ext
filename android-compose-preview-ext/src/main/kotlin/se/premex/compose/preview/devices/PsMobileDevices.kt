package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PS_Mobile device specifications for Android Compose previews.
 *
 * This extension provides PS_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PsMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PsMobile: Any
  get() = object {
      /** PS_Mobile Neo_Pro */
      val NEO_PRO = "spec:width=480,height=960,unit=px,dpi=240"

  }
