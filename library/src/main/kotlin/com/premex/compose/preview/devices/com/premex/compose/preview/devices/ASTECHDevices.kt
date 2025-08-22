package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ASTECH device specifications for Android Compose previews.
 *
 * This extension provides ASTECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ASTECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ASTECH: Any
  get() = object {
      /** DeviceSpec(manufacturer=ASTECH, code=Astech_IRIS, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASTECH, code=Astech_IRIS,
      width=720, height=1612, dpi=280, isGoogleDevice=false).code */
      val ASTECH_IRIS = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ASTECH, code=Astech_S7, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASTECH, code=Astech_S7, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val ASTECH_S7 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ASTECH, code=Astech_S8, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASTECH, code=Astech_S8, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val ASTECH_S8 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ASTECH, code=Astech_S9, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASTECH, code=Astech_S9, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val ASTECH_S9 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ASTECH, code=R10G, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASTECH, code=R10G, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val R10G = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ASTECH, code=R3, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASTECH, code=R3, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ASTECH, code=R3_GTV, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASTECH, code=R3_GTV, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ASTECH, code=R4, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASTECH, code=R4, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ASTECH, code=tamachi, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASTECH, code=tamachi, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ASTECH, code=yeongdeungpo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASTECH, code=yeongdeungpo,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
