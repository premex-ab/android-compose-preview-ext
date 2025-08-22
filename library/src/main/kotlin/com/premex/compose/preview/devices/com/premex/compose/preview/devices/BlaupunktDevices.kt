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
      /** DeviceSpec(manufacturer=Blaupunkt, code=Blaupunkt_SF02, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=Blaupunkt_SF02,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BLAUPUNKT_SF02 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blaupunkt, code=Blaupunkt_SM_02, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=Blaupunkt_SM_02,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val BLAUPUNKT_SM_02 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blaupunkt, code=Blaupunkt_SM_05, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=Blaupunkt_SM_05,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val BLAUPUNKT_SM_05 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blaupunkt, code=Blaupunkt_TX60, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=Blaupunkt_TX60,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val BLAUPUNKT_TX60 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blaupunkt, code=BP_6108, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=BP_6108, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BP_6108 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blaupunkt, code=BP_6110, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=BP_6110, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val BP_6110 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Blaupunkt, code=BP_T6108X, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=BP_T6108X,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val BP_T6108X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blaupunkt, code=BP_T6110X, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=BP_T6110X,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val BP_T6110X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blaupunkt, code=capitolhill, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=capitolhill,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blaupunkt, code=ewha, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=ewha, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val EWHA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blaupunkt, code=expo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=expo, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val EXPO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blaupunkt, code=Guardian, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=Guardian,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GUARDIAN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blaupunkt, code=kaitak, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=kaitak, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KAITAK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blaupunkt, code=keoneae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=keoneae,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blaupunkt, code=marina, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=marina, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blaupunkt, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=martin, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blaupunkt, code=OT16, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=OT16, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val OT16 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blaupunkt, code=OT19, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=OT19, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val OT19 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blaupunkt, code=SF04_4G_EEA, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=SF04_4G_EEA,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val SF04_4G_EEA = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Blaupunkt, code=shinjuku, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=shinjuku,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val SHINJUKU = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blaupunkt, code=sindang, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=sindang,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SINDANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blaupunkt, code=SL05, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=SL05, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SL05 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Blaupunkt, code=tamachi, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=tamachi, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blaupunkt, code=tennoji, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=tennoji, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TENNOJI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Blaupunkt, code=TX01, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=TX01, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val TX01 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Blaupunkt, code=yeongdeungpo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blaupunkt, code=yeongdeungpo,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
