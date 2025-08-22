package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Mione device specifications for Android Compose previews.
 *
 * This extension provides Mione device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mione.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mione: Any
  get() = object {
      /** Mione MIONEI */
      val MIONEI = "spec:width=720,height=1560,unit=px,dpi=240"

      /** Mione Mione_Pro_Plus */
      val MIONE_PRO_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Mione mione_S20 */
      val MIONE_S20 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Mione M-701Plus */
      val M_701PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

  }
