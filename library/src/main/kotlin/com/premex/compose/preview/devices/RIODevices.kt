package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RIO device specifications for Android Compose previews.
 *
 * This extension provides RIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RIO: Any
  get() = object {
      /** RIO R7MAX */
      val R7MAX = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RIO RIOPAD_7 */
      val RIOPAD_7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** RIO RIOPAD_S10_Pro */
      val RIOPAD_S10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** RIO RW8 */
      val RW8 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
