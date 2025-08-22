package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Partner_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Partner_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PartnerMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PartnerMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=Partner_Mobile, code=E22, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Partner_Mobile, code=E22,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val E22 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Partner_Mobile, code=EV1_PRO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Partner_Mobile, code=EV1_PRO,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val EV1_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Partner_Mobile, code=Partner_Evolution, width=720, height=1520,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Partner_Mobile,
      code=Partner_Evolution, width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val PARTNER_EVOLUTION = "spec:width=720,height=1520,unit=px,dpi=320"

  }
