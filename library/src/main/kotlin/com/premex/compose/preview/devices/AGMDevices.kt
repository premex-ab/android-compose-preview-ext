package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AGM device specifications for Android Compose previews.
 *
 * This extension provides AGM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AGM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AGM: Any
  get() = object {
      /** AGM AGM_Glory_G1 */
      val AGM_GLORY_G1 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** AGM AGM_Glory_G1S_EU */
      val AGM_GLORY_G1S_EU = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** AGM AGM_Glory_G1S_US */
      val AGM_GLORY_G1S_US = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** AGM AGM_H3 */
      val AGM_H3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** AGM AGM_H5 */
      val AGM_H5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** AGM AGM_H5_PRO */
      val AGM_H5_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** AGM AGM_H6 */
      val AGM_H6 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** AGM AGM_H_MAX */
      val AGM_H_MAX = "spec:width=720,height=1612,unit=px,dpi=480"

      /** AGM AGM_Note_N1 */
      val AGM_NOTE_N1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** AGM AGM_PAD_P1 */
      val AGM_PAD_P1 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** AGM AGM_PAD_P2 */
      val AGM_PAD_P2 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** AGM AGM_PAD_P2_ACTIVE */
      val AGM_PAD_P2_ACTIVE = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** AGM AGM_PAD_T1 */
      val AGM_PAD_T1 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** AGM AGM_PAD_T1_WIFI */
      val AGM_PAD_T1_WIFI = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** AGM AGM_PAD_T2 */
      val AGM_PAD_T2 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** AGM AGM_PAD_T3 */
      val AGM_PAD_T3 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** AGM AGM_X6_EEA */
      val AGM_X6_EEA = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** AGM AGM_X6_RU */
      val AGM_X6_RU = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** AGM Android_Tablet */
      val ANDROID_TABLET = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** AGM HS8952QC */
      val HS8952QC = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** AGM HS8976QC */
      val HS8976QC = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** AGM HSSDM450QC */
      val HSSDM450QC = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** AGM HSSDM845QC */
      val HSSDM845QC = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** AGM SHARKL5 */
      val SHARKL5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** AGM T91EUE1 */
      val T91EUE1 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
