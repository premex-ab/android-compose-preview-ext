package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Technicolor device specifications for Android Compose previews.
 *
 * This extension provides Technicolor device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Technicolor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Technicolor: Any
  get() = object {
      /** DeviceSpec(manufacturer=Technicolor, code=dci765ekt, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Technicolor, code=dci765ekt,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DCI765EKT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Technicolor, code=dwt765lmt, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Technicolor, code=dwt765lmt,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DWT765LMT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Technicolor, code=dwt765ti, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Technicolor, code=dwt765ti,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DWT765TI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Technicolor, code=uie4027lgu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Technicolor, code=uie4027lgu,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UIE4027LGU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Technicolor, code=uiw4010ech, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Technicolor, code=uiw4010ech,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UIW4010ECH = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Technicolor, code=uzw4010tim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Technicolor, code=uzw4010tim,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UZW4010TIM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
