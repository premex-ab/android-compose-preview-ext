package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FLOW device specifications for Android Compose previews.
 *
 * This extension provides FLOW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FLOW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FLOW: Any
  get() = object {
      /** FLOW B866V2F_FLOW */
      val B866V2F_FLOW = "spec:width=720,height=1280,unit=px,dpi=213"

      /** FLOW HP40A2 */
      val HP40A2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** FLOW HP44H */
      val HP44H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** FLOW m250_t */
      val M250_T = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** FLOW m393gena_teco */
      val M393GENA_TECO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
