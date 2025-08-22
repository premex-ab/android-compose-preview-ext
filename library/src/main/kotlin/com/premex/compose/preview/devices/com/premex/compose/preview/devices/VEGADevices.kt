package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VEGA device specifications for Android Compose previews.
 *
 * This extension provides VEGA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VEGA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VEGA: Any
  get() = object {
      /** DeviceSpec(manufacturer=VEGA, code=ef49k, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEGA, code=ef49k, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EF49K = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VEGA, code=ef51k, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEGA, code=ef51k, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val EF51K = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=VEGA, code=ef52k, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEGA, code=ef52k, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EF52K = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VEGA, code=ef52s, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEGA, code=ef52s, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EF52S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VEGA, code=EF56S, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEGA, code=EF56S, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val EF56S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=VEGA, code=EF59K, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEGA, code=EF59K, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val EF59K = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=VEGA, code=EF59L, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEGA, code=EF59L, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val EF59L = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=VEGA, code=EF59S, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEGA, code=EF59S, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val EF59S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=VEGA, code=ef60s, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEGA, code=ef60s, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val EF60S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=VEGA, code=ef61k, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEGA, code=ef61k, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val EF61K = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=VEGA, code=ef63k, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEGA, code=ef63k, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val EF63K = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=VEGA, code=ef63s, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEGA, code=ef63s, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val EF63S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=VEGA, code=tamachi, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEGA, code=tamachi, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VEGA, code=yeongdeungpo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEGA, code=yeongdeungpo,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
