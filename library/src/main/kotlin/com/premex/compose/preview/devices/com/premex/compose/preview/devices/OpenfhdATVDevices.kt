package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * open_fhd_ATV device specifications for Android Compose previews.
 *
 * This extension provides open_fhd_ATV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OpenfhdATV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OpenfhdATV: Any
  get() = object {
      /** DeviceSpec(manufacturer=open_fhd_ATV, code=open_fhd_ap, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=open_fhd_ATV, code=open_fhd_ap,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val OPEN_FHD_AP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=open_fhd_ATV, code=open_fhd_sa, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=open_fhd_ATV, code=open_fhd_sa,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val OPEN_FHD_SA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
