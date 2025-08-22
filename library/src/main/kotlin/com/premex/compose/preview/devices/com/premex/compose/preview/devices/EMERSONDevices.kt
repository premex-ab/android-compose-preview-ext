package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EMERSON device specifications for Android Compose previews.
 *
 * This extension provides EMERSON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EMERSON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EMERSON: Any
  get() = object {
      /** DeviceSpec(manufacturer=EMERSON, code=EID_1050, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EMERSON, code=EID_1050, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val EID_1050 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EMERSON, code=EID_1061, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EMERSON, code=EID_1061, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val EID_1061 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EMERSON, code=EID_9000, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EMERSON, code=EID_9000, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val EID_9000 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
