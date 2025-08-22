package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XGIMI device specifications for Android Compose previews.
 *
 * This extension provides XGIMI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XGIMI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XGIMI: Any
  get() = object {
      /** DeviceSpec(manufacturer=XGIMI, code=altai, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGIMI, code=altai, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ALTAI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=XGIMI, code=xgimiapollo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGIMI, code=xgimiapollo,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val XGIMIAPOLLO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=XGIMI, code=xgimigalileo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGIMI, code=xgimigalileo,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val XGIMIGALILEO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
