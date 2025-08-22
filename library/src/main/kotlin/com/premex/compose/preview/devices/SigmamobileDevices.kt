package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sigma_mobile device specifications for Android Compose previews.
 *
 * This extension provides Sigma_mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sigmamobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sigmamobile: Any
  get() = object {
      /** Sigma_mobile PQ18_MAX */
      val PQ18_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Sigma_mobile Tab_A1010_Neo */
      val TAB_A1010_NEO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Sigma_mobile Tab_A1025_2 */
      val TAB_A1025_2 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Sigma_mobile Tab_A1033_X-treme */
      val TAB_A1033_X_TREME = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Sigma_mobile Tab_A802 */
      val TAB_A802 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Sigma_mobile X-Style_S5501 */
      val X_STYLE_S5501 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Sigma_mobile X-Style_S5502 */
      val X_STYLE_S5502 = "spec:width=480,height=1016,unit=px,dpi=200"

      /** Sigma_mobile X_style_Tab_A1010 */
      val X_STYLE_TAB_A1010 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Sigma_mobile X_Style_Tab_A103 */
      val X_STYLE_TAB_A103 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Sigma_mobile X_Style_Tab_A104 */
      val X_STYLE_TAB_A104 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Sigma_mobile X_style_Tab_A801 */
      val X_STYLE_TAB_A801 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Sigma_mobile X_style_Tab_A83 */
      val X_STYLE_TAB_A83 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Sigma_mobile X-treme_PQ18 */
      val X_TREME_PQ18 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Sigma_mobile X-treme_PQ20 */
      val X_TREME_PQ20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Sigma_mobile X-treme_PQ24 */
      val X_TREME_PQ24 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Sigma_mobile X-treme_PQ28 */
      val X_TREME_PQ28 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Sigma_mobile X-treme_PQ29 */
      val X_TREME_PQ29 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Sigma_mobile X-treme_PQ36 */
      val X_TREME_PQ36 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Sigma_mobile X-TREME_PQ37 */
      val X_TREME_PQ37 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** Sigma_mobile X-TREME_PQ52 */
      val X_TREME_PQ52 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Sigma_mobile X-treme_PQ53 */
      val X_TREME_PQ53 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Sigma_mobile X-treme_PQ54 */
      val X_TREME_PQ54 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Sigma_mobile X-treme_PQ54_MAX */
      val X_TREME_PQ54_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Sigma_mobile X-treme_PQ55 */
      val X_TREME_PQ55 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Sigma_mobile X_treme_PQ56 */
      val X_TREME_PQ56 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** Sigma_mobile X-treme_PQ57 */
      val X_TREME_PQ57 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** Sigma_mobile X-treme_PQ58 */
      val X_TREME_PQ58 = "spec:width=1080,height=2408,unit=px,dpi=480"

  }
