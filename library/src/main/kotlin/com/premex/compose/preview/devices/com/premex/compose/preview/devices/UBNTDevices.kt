package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UBNT device specifications for Android Compose previews.
 *
 * This extension provides UBNT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UBNT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UBNT: Any
  get() = object {
      /** DeviceSpec(manufacturer=UBNT, code=capri_ubq_telefi5, width=640, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UBNT, code=capri_ubq_telefi5,
      width=640, height=960, dpi=240, isGoogleDevice=false).code */
      val CAPRI_UBQ_TELEFI5 = "spec:width=640,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=UBNT, code=capri_ubq_telefi5p, width=640, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UBNT, code=capri_ubq_telefi5p,
      width=640, height=960, dpi=240, isGoogleDevice=false).code */
      val CAPRI_UBQ_TELEFI5P = "spec:width=640,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=UBNT, code=capri_ubq_telefi7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UBNT, code=capri_ubq_telefi7,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val CAPRI_UBQ_TELEFI7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
