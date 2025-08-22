package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Homeplustv device specifications for Android Compose previews.
 *
 * This extension provides Homeplustv device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Homeplustv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Homeplustv: Any
  get() = object {
      /** Homeplustv HCA6010 */
      val HCA6010 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Homeplustv STB6252C */
      val STB6252C = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Homeplustv vsb3918_apac */
      val VSB3918_APAC = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
