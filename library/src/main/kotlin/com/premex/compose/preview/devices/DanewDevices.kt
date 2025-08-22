package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Danew device specifications for Android Compose previews.
 *
 * This extension provides Danew device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Danew.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Danew: Any
  get() = object {
      /** Danew D809ProPlus */
      val D809PROPLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Danew Dbook112_EEA */
      val DBOOK112_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Danew Dbook_110 */
      val DBOOK_110 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Danew Dbook_111 */
      val DBOOK_111 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Danew Dslide1013QC_v2 */
      val DSLIDE1013QC_V2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Danew Dslide1013QC_v3 */
      val DSLIDE1013QC_V3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Danew Dslide1013QC_v4 */
      val DSLIDE1013QC_V4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Danew Dslide1016_V2 */
      val DSLIDE1016_V2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Danew Dslide1019 */
      val DSLIDE1019 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Danew Dslide716 */
      val DSLIDE716 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Danew Dslide807 */
      val DSLIDE807 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Danew Dslide808 */
      val DSLIDE808 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Danew Dslide_1020 */
      val DSLIDE_1020 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Danew Dslide_1020M */
      val DSLIDE_1020M = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Danew Dslide_1020Pro */
      val DSLIDE_1020PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Danew Dslide_1021 */
      val DSLIDE_1021 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Danew Dslide_1021C */
      val DSLIDE_1021C = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Danew Dslide_1095 */
      val DSLIDE_1095 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Danew Dslide_113 */
      val DSLIDE_113 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Danew Dslide_114 */
      val DSLIDE_114 = "spec:width=1200,height=1920,unit=px,dpi=200"

      /** Danew Dslide_115 */
      val DSLIDE_115 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Danew Dslide_809Pro */
      val DSLIDE_809PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Danew Dslide_809_EEA */
      val DSLIDE_809_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Danew G27 */
      val G27 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** Danew Konnect402 */
      val KONNECT402 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Danew Konnect602 */
      val KONNECT602 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Danew Konnect_508 */
      val KONNECT_508 = "spec:width=480,height=854,unit=px,dpi=213"

      /** Danew Konnect_509 */
      val KONNECT_509 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Danew Konnect_601 */
      val KONNECT_601 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Danew Konnect_607 */
      val KONNECT_607 = "spec:width=600,height=1280,unit=px,dpi=320"

      /** Danew Konnect_608 */
      val KONNECT_608 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Danew T_ONE */
      val T_ONE = "spec:width=720,height=1440,unit=px,dpi=320"

  }
