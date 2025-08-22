package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ANS_NKS device specifications for Android Compose previews.
 *
 * This extension provides ANS_NKS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AnsNks.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AnsNks: Any
  get() = object {
      /** ANS_NKS NKS_AQT80 */
      val NKS_AQT80 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
