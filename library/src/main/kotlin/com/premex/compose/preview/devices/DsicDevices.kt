package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DSIC device specifications for Android Compose previews.
 *
 * This extension provides DSIC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dsic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dsic: Any
  get() = object {
      /** DSIC ds6 */
      val DS6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DSIC DS60S */
      val DS60S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DSIC RD86QE */
      val RD86QE = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
