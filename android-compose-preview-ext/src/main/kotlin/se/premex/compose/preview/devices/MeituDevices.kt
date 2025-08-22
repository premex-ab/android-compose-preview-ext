package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Meitu device specifications for Android Compose previews.
 *
 * This extension provides Meitu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Meitu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Meitu: Any
  get() = object {
      /** Meitu M6 */
      val M6 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Meitu Maya */
      val MAYA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Meitu MayaS */
      val MAYAS = "spec:width=1080,height=2220,unit=px,dpi=440"

      /** Meitu Melody */
      val MELODY = "spec:width=1080,height=2244,unit=px,dpi=480"

      /** Meitu Tiffany */
      val TIFFANY = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Meitu vela */
      val VELA = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** Meitu Victoria */
      val VICTORIA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Meitu VictoriaS */
      val VICTORIAS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Meitu Vivian */
      val VIVIAN = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
