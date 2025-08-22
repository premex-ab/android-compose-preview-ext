package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DUODUOGO device specifications for Android Compose previews.
 *
 * This extension provides DUODUOGO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DUODUOGO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DUODUOGO: Any
  get() = object {
      /** DeviceSpec(manufacturer=DUODUOGO, code=S10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DUODUOGO, code=S10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DUODUOGO, code=S10_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DUODUOGO, code=S10_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DUODUOGO, code=S7_EEA, width=800, height=1332, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DUODUOGO, code=S7_EEA, width=800,
      height=1332, dpi=160, isGoogleDevice=false).code */
      val S7_EEA = "spec:width=800,height=1332,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DUODUOGO, code=S8, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DUODUOGO, code=S8, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DUODUOGO, code=Tab_A7, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DUODUOGO, code=Tab_A7, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_A7 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DUODUOGO, code=TAB_S2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DUODUOGO, code=TAB_S2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_S2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DUODUOGO, code=TAB_S2_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DUODUOGO, code=TAB_S2_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_S2_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
