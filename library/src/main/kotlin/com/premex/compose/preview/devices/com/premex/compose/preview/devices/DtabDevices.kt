package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * dtab device specifications for Android Compose previews.
 *
 * This extension provides dtab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dtab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dtab: Any
  get() = object {
      /** DeviceSpec(manufacturer=dtab, code=d-01G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=dtab, code=d-01G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val D_01G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=dtab, code=d-01H, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=dtab, code=d-01H, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val D_01H = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=dtab, code=d-01J, width=1600, height=2560, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=dtab, code=d-01J, width=1600,
      height=2560, dpi=400, isGoogleDevice=false).code */
      val D_01J = "spec:width=1600,height=2560,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=dtab, code=d-01K, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=dtab, code=d-01K, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val D_01K = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=dtab, code=d-02H, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=dtab, code=d-02H, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val D_02H = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=dtab, code=d-02K, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=dtab, code=d-02K, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val D_02K = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=dtab, code=d-41A, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=dtab, code=d-41A, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val D_41A = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=dtab, code=d-51C, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=dtab, code=d-51C, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val D_51C = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
