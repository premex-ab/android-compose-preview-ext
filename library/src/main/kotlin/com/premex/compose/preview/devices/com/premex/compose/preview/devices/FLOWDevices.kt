package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FLOW device specifications for Android Compose previews.
 *
 * This extension provides FLOW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FLOW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FLOW: Any
  get() = object {
      /** DeviceSpec(manufacturer=FLOW, code=B866V2F_FLOW, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FLOW, code=B866V2F_FLOW, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val B866V2F_FLOW = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FLOW, code=HP40A2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FLOW, code=HP40A2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HP40A2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FLOW, code=HP44H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FLOW, code=HP44H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HP44H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FLOW, code=m250_t, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FLOW, code=m250_t, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val M250_T = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FLOW, code=m393gena_teco, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FLOW, code=m393gena_teco,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val M393GENA_TECO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
