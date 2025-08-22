package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hurricane device specifications for Android Compose previews.
 *
 * This extension provides Hurricane device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hurricane.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hurricane: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hurricane, code=Curve, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hurricane, code=Curve, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val CURVE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hurricane, code=DZIRE, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hurricane, code=DZIRE, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val DZIRE = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hurricane, code=Excite, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hurricane, code=Excite, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val EXCITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hurricane, code=Flame_Plus, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hurricane, code=Flame_Plus,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val FLAME_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hurricane, code=Fuel, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hurricane, code=Fuel, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val FUEL = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hurricane, code=Icon, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hurricane, code=Icon, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ICON = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hurricane, code=Iris, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hurricane, code=Iris, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val IRIS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hurricane, code=LINK, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hurricane, code=LINK, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LINK = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hurricane, code=pulse, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hurricane, code=pulse, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PULSE = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hurricane, code=Ridge_Plus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hurricane, code=Ridge_Plus,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val RIDGE_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hurricane, code=Rush_Plus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hurricane, code=Rush_Plus,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val RUSH_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hurricane, code=Storm, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hurricane, code=Storm, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val STORM = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hurricane, code=VortexPlus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hurricane, code=VortexPlus,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val VORTEXPLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hurricane, code=Vulcan, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hurricane, code=Vulcan, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val VULCAN = "spec:width=540,height=960,unit=px,dpi=240"

  }
