package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Gplus device specifications for Android Compose previews.
 *
 * This extension provides Gplus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gplus: Any
  get() = object {
      /** DeviceSpec(manufacturer=Gplus, code=P10, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gplus, code=P10, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val P10 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gplus, code=P10_2022, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gplus, code=P10_2022, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val P10_2022 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gplus, code=P10_Plus, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gplus, code=P10_Plus, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val P10_PLUS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gplus, code=Q10, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gplus, code=Q10, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val Q10 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gplus, code=S10, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gplus, code=S10, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gplus, code=T10, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gplus, code=T10, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val T10 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gplus, code=X10, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gplus, code=X10, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gplus, code=X10_Plus, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gplus, code=X10_Plus, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X10_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Gplus, code=Z10, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gplus, code=Z10, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z10 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
