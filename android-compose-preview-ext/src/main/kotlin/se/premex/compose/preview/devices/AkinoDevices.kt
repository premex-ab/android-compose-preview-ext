package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AKINO device specifications for Android Compose previews.
 *
 * This extension provides AKINO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Akino.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Akino: Any
  get() = object {
      /** AKINO hamamatsucho */
      val HAMAMATSUCHO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** AKINO laoshan */
      val LAOSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
