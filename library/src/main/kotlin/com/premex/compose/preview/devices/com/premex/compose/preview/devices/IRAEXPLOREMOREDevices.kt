package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IRA_EXPLORE_MORE device specifications for Android Compose previews.
 *
 * This extension provides IRA_EXPLORE_MORE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IRAEXPLOREMORE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IRAEXPLOREMORE: Any
  get() = object {
      /** DeviceSpec(manufacturer=IRA_EXPLORE_MORE, code=IRAT803, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRA_EXPLORE_MORE, code=IRAT803,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val IRAT803 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRA_EXPLORE_MORE, code=IRA_BIO, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRA_EXPLORE_MORE, code=IRA_BIO,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val IRA_BIO = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRA_EXPLORE_MORE, code=IRA_T1029, width=1200, height=2000,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRA_EXPLORE_MORE,
      code=IRA_T1029, width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val IRA_T1029 = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
