package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAZE_SPEED device specifications for Android Compose previews.
 *
 * This extension provides MAZE_SPEED device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MAZESPEED.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MAZESPEED: Any
  get() = object {
      /** DeviceSpec(manufacturer=MAZE_SPEED, code=M1582C, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAZE_SPEED, code=M1582C, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val M1582C = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MAZE_SPEED, code=M1582C_MAX, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAZE_SPEED, code=M1582C_MAX,
      width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val M1582C_MAX = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=MAZE_SPEED, code=M1586K, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAZE_SPEED, code=M1586K, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val M1586K = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=MAZE_SPEED, code=MS5314G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAZE_SPEED, code=MS5314G,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val MS5314G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MAZE_SPEED, code=MS5414G, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAZE_SPEED, code=MS5414G,
      width=480, height=854, dpi=213, isGoogleDevice=false).code */
      val MS5414G = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MAZE_SPEED, code=MS5424G, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAZE_SPEED, code=MS5424G,
      width=480, height=960, dpi=220, isGoogleDevice=false).code */
      val MS5424G = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=MAZE_SPEED, code=MS5514G, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAZE_SPEED, code=MS5514G,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val MS5514G = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MAZE_SPEED, code=MS5539G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAZE_SPEED, code=MS5539G,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val MS5539G = "spec:width=480,height=960,unit=px,dpi=240"

  }
