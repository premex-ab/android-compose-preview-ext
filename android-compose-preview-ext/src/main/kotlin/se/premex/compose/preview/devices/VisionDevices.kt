package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Vision device specifications for Android Compose previews.
 *
 * This extension provides Vision device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vision.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vision: Any
  get() = object {
      /** Vision martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Vision tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

  }
