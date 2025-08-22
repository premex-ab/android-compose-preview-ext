package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COOPERS device specifications for Android Compose previews.
 *
 * This extension provides COOPERS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Coopers.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Coopers: Any
  get() = object {
      /** COOPERS CP10 */
      val CP10 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** COOPERS CP20 */
      val CP20 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COOPERS CP70K */
      val CP70K = "spec:width=600,height=1024,unit=px,dpi=160"

      /** COOPERS CP80 */
      val CP80 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** COOPERS CP81 */
      val CP81 = "spec:width=800,height=1280,unit=px,dpi=180"

  }
