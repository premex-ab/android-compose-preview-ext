package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TOPSAND device specifications for Android Compose previews.
 *
 * This extension provides TOPSAND device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Topsand.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Topsand: Any
  get() = object {
      /** TOPSAND G12_A14 */
      val G12_A14 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TOPSAND M8_U */
      val M8_U = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TOPSAND N8_KIDS */
      val N8_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TOPSAND N8_Plus */
      val N8_PLUS = "spec:width=800,height=1340,unit=px,dpi=213"

  }
