package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * globe_ATV device specifications for Android Compose previews.
 *
 * This extension provides globe_ATV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GlobeATV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GlobeATV: Any
  get() = object {
      /** DeviceSpec(manufacturer=globe_ATV, code=globe_ap, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=globe_ATV, code=globe_ap,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val GLOBE_AP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=globe_ATV, code=globe_eu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=globe_ATV, code=globe_eu,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val GLOBE_EU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=globe_ATV, code=globe_na, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=globe_ATV, code=globe_na,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val GLOBE_NA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=globe_ATV, code=globe_sa, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=globe_ATV, code=globe_sa,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val GLOBE_SA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
