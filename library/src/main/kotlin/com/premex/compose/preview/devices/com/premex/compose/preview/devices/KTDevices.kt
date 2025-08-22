package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KT device specifications for Android Compose previews.
 *
 * This extension provides KT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KT: Any
  get() = object {
      /** DeviceSpec(manufacturer=KT, code=KG2100, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KT, code=KG2100, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KG2100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KT, code=KG3100, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KT, code=KG3100, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KG3100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KT, code=KG4100, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KT, code=KG4100, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KG4100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KT, code=KI1101, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KT, code=KI1101, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KI1101 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KT, code=KSTB6188, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KT, code=KSTB6188, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KSTB6188 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KT, code=MA4000, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KT, code=MA4000, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MA4000 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KT, code=MA4100, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KT, code=MA4100, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MA4100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KT, code=MAR4510C, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KT, code=MAR4510C, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MAR4510C = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KT, code=mau4800d, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KT, code=mau4800d, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MAU4800D = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
