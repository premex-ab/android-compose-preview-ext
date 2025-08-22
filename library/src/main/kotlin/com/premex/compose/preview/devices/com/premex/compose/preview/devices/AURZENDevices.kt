package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AURZEN device specifications for Android Compose previews.
 *
 * This extension provides AURZEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AURZEN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AURZEN: Any
  get() = object {
      /** DeviceSpec(manufacturer=AURZEN, code=TB-AS100A, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AURZEN, code=TB-AS100A, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TB_AS100A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AURZEN, code=TB-AS110A, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AURZEN, code=TB-AS110A, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val TB_AS110A = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AURZEN, code=yandangshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AURZEN, code=yandangshan,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val YANDANGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
