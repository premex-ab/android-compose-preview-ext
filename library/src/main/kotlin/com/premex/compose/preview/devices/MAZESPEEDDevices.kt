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
      /** MAZE_SPEED M1582C */
      val M1582C = "spec:width=480,height=960,unit=px,dpi=213"

      /** MAZE_SPEED M1582C_MAX */
      val M1582C_MAX = "spec:width=480,height=960,unit=px,dpi=200"

      /** MAZE_SPEED M1586K */
      val M1586K = "spec:width=480,height=960,unit=px,dpi=200"

      /** MAZE_SPEED MS5314G */
      val MS5314G = "spec:width=480,height=960,unit=px,dpi=240"

      /** MAZE_SPEED MS5414G */
      val MS5414G = "spec:width=480,height=854,unit=px,dpi=213"

      /** MAZE_SPEED MS5424G */
      val MS5424G = "spec:width=480,height=960,unit=px,dpi=220"

      /** MAZE_SPEED MS5514G */
      val MS5514G = "spec:width=480,height=960,unit=px,dpi=213"

      /** MAZE_SPEED MS5539G */
      val MS5539G = "spec:width=480,height=960,unit=px,dpi=240"

  }
