package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DISH device specifications for Android Compose previews.
 *
 * This extension provides DISH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DISH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DISH: Any
  get() = object {
      /** DISH ATVMJ4 */
      val ATVMJ4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DISH ATVWJ4 */
      val ATVWJ4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DISH EU001 */
      val EU001 = "spec:width=480,height=800,unit=px,dpi=200"

      /** DISH m377_dish */
      val M377_DISH = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DISH SNAP2 */
      val SNAP2 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
