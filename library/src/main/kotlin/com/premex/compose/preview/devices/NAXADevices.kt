package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NAXA device specifications for Android Compose previews.
 *
 * This extension provides NAXA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NAXA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NAXA: Any
  get() = object {
      /** NAXA NID-1050 */
      val NID_1050 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** NAXA NID_1055 */
      val NID_1055 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** NAXA NID_1056 */
      val NID_1056 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** NAXA NID_7021 */
      val NID_7021 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** NAXA NID_7022 */
      val NID_7022 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** NAXA NID_7055 */
      val NID_7055 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** NAXA NID_7056 */
      val NID_7056 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
