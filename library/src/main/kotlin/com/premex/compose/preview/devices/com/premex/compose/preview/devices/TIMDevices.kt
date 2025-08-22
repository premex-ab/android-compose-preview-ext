package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TIM device specifications for Android Compose previews.
 *
 * This extension provides TIM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TIM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TIM: Any
  get() = object {
      /** DeviceSpec(manufacturer=TIM, code=m393gena_tim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TIM, code=m393gena_tim, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val M393GENA_TIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TIM, code=m393vsb_tim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TIM, code=m393vsb_tim, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val M393VSB_TIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TIM, code=uzw4054tim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TIM, code=uzw4054tim, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val UZW4054TIM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
