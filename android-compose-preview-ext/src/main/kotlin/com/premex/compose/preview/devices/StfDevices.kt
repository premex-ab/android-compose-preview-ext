package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STF device specifications for Android Compose previews.
 *
 * This extension provides STF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Stf.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Stf: Any
  get() = object {
      /** STF AURA */
      val AURA = "spec:width=480,height=960,unit=px,dpi=240"

      /** STF Block */
      val BLOCK = "spec:width=480,height=854,unit=px,dpi=240"

      /** STF BLOCK_3 */
      val BLOCK_3 = "spec:width=480,height=854,unit=px,dpi=240"

      /** STF BLOCK_GO */
      val BLOCK_GO = "spec:width=480,height=854,unit=px,dpi=240"

      /** STF BLOCK_MINI */
      val BLOCK_MINI = "spec:width=480,height=800,unit=px,dpi=240"

  }
