package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ODYS device specifications for Android Compose previews.
 *
 * This extension provides ODYS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ODYS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ODYS: Any
  get() = object {
      /** DeviceSpec(manufacturer=ODYS, code=FALCON_10_PLUS_3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ODYS, code=FALCON_10_PLUS_3G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val FALCON_10_PLUS_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ODYS, code=GOAL_10_PLUS_3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ODYS, code=GOAL_10_PLUS_3G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val GOAL_10_PLUS_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ODYS, code=JUNIOR_8_PRO, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ODYS, code=JUNIOR_8_PRO, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val JUNIOR_8_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ODYS, code=Maven_T10_pro, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ODYS, code=Maven_T10_pro,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MAVEN_T10_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ODYS, code=NoteTab_Pro, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ODYS, code=NoteTab_Pro, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val NOTETAB_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ODYS, code=PACE10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ODYS, code=PACE10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PACE10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ODYS, code=T1011S, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ODYS, code=T1011S, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val T1011S = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ODYS, code=T1021, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ODYS, code=T1021, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val T1021 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ODYS, code=THANOS_10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ODYS, code=THANOS_10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val THANOS_10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ODYS, code=Titan_10_LTE, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ODYS, code=Titan_10_LTE, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TITAN_10_LTE = "spec:width=800,height=1280,unit=px,dpi=160"

  }
