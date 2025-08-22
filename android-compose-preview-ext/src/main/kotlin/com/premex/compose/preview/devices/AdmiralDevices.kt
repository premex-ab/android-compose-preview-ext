package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Admiral device specifications for Android Compose previews.
 *
 * This extension provides Admiral device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Admiral.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Admiral: Any
  get() = object {
      /** Admiral anglelake */
      val ANGLELAKE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Admiral Fire */
      val FIRE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Admiral One_Mundial */
      val ONE_MUNDIAL = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Admiral waiawa */
      val WAIAWA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
