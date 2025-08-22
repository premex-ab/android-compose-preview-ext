package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * alba device specifications for Android Compose previews.
 *
 * This extension provides alba device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Alba.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Alba: Any
  get() = object {
      /** alba ac101cplv3 */
      val AC101CPLV3 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** alba ac40as3g */
      val AC40AS3G = "spec:width=480,height=800,unit=px,dpi=240"

  }
