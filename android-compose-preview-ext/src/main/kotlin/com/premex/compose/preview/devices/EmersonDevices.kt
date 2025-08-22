package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EMERSON device specifications for Android Compose previews.
 *
 * This extension provides EMERSON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Emerson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Emerson: Any
  get() = object {
      /** EMERSON EID_1050 */
      val EID_1050 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** EMERSON EID_1061 */
      val EID_1061 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** EMERSON EID_9000 */
      val EID_9000 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
