package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * azpen device specifications for Android Compose previews.
 *
 * This extension provides azpen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Azpen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Azpen: Any
  get() = object {
      /** azpen A1083 */
      val A1083 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** azpen C-603 */
      val C_603 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
