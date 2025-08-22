package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VIZIO device specifications for Android Compose previews.
 *
 * This extension provides VIZIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vizio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vizio: Any
  get() = object {
      /** VIZIO XR6M10 */
      val XR6M10 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** VIZIO XR6P10 */
      val XR6P10 = "spec:width=1080,height=1920,unit=px,dpi=400"

  }
