package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SHIFT device specifications for Android Compose previews.
 *
 * This extension provides SHIFT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SHIFT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SHIFT: Any
  get() = object {
      /** DeviceSpec(manufacturer=SHIFT, code=axolotl, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHIFT, code=axolotl, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val AXOLOTL = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=SHIFT, code=otter, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHIFT, code=otter, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val OTTER = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=SHIFT, code=SHIFT6m, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHIFT, code=SHIFT6m, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val SHIFT6M = "spec:width=1080,height=1920,unit=px,dpi=420"

  }
