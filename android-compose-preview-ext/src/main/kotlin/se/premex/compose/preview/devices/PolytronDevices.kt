package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * POLYTRON device specifications for Android Compose previews.
 *
 * This extension provides POLYTRON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Polytron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Polytron: Any
  get() = object {
      /** POLYTRON lakeside */
      val LAKESIDE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** POLYTRON lushan */
      val LUSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** POLYTRON mateo */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** POLYTRON nagai */
      val NAGAI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** POLYTRON PDB_F2 */
      val PDB_F2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** POLYTRON pioneer */
      val PIONEER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** POLYTRON POLYTRON_A552 */
      val POLYTRON_A552 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** POLYTRON POLYTRON_P552 */
      val POLYTRON_P552 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** POLYTRON POLYTRON_R2509 */
      val POLYTRON_R2509 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** POLYTRON POLYTRON_R2509SE */
      val POLYTRON_R2509SE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** POLYTRON POLYTRON_R250A */
      val POLYTRON_R250A = "spec:width=720,height=1280,unit=px,dpi=320"

  }
