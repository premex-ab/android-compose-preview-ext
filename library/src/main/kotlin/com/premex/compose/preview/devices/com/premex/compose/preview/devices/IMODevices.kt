package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IMO device specifications for Android Compose previews.
 *
 * This extension provides IMO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IMO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IMO: Any
  get() = object {
      /** DeviceSpec(manufacturer=IMO, code=IMO_Q2_Plus, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IMO, code=IMO_Q2_Plus, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val IMO_Q2_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IMO, code=IMO_Q2_Pro, width=480, height=800, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IMO, code=IMO_Q2_Pro, width=480,
      height=800, dpi=213, isGoogleDevice=false).code */
      val IMO_Q2_PRO = "spec:width=480,height=800,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IMO, code=IMO_Q3_Plus, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IMO, code=IMO_Q3_Plus, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val IMO_Q3_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IMO, code=IMO_Q4_Pro, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IMO, code=IMO_Q4_Pro, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val IMO_Q4_PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IMO, code=IMO_Q5, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IMO, code=IMO_Q5, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val IMO_Q5 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=IMO, code=S2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IMO, code=S2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S2 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
