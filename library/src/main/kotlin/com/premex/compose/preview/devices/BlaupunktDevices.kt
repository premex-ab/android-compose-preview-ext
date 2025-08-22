package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Blaupunkt device specifications for Android Compose previews.
 *
 * This extension provides Blaupunkt device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Blaupunkt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Blaupunkt: Any
  get() = object {
      /** Blaupunkt Blaupunkt_SF02 */
      val BLAUPUNKT_SF02 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Blaupunkt Blaupunkt_SM_02 */
      val BLAUPUNKT_SM_02 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Blaupunkt Blaupunkt_SM_05 */
      val BLAUPUNKT_SM_05 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Blaupunkt Blaupunkt_TX60 */
      val BLAUPUNKT_TX60 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Blaupunkt BP_6108 */
      val BP_6108 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blaupunkt BP_6110 */
      val BP_6110 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Blaupunkt BP_T6108X */
      val BP_T6108X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blaupunkt BP_T6110X */
      val BP_T6110X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Blaupunkt capitolhill */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Blaupunkt ewha */
      val EWHA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Blaupunkt expo */
      val EXPO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Blaupunkt Guardian */
      val GUARDIAN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Blaupunkt kaitak */
      val KAITAK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Blaupunkt keoneae */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Blaupunkt marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Blaupunkt martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Blaupunkt OT16 */
      val OT16 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Blaupunkt OT19 */
      val OT19 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Blaupunkt SF04_4G_EEA */
      val SF04_4G_EEA = "spec:width=480,height=800,unit=px,dpi=240"

      /** Blaupunkt shinjuku */
      val SHINJUKU = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Blaupunkt sindang */
      val SINDANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Blaupunkt SL05 */
      val SL05 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** Blaupunkt tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Blaupunkt tennoji */
      val TENNOJI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Blaupunkt TX01 */
      val TX01 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Blaupunkt yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
