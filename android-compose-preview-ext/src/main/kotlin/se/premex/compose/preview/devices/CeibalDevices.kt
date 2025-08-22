package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CEIBAL device specifications for Android Compose previews.
 *
 * This extension provides CEIBAL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ceibal.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ceibal: Any
  get() = object {
      /** CEIBAL BETELGEUSE */
      val BETELGEUSE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** CEIBAL Kil-82WFDC */
      val KIL_82WFDC = "spec:width=800,height=1280,unit=px,dpi=160"

  }
