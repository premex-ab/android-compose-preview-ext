package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Alphatel device specifications for Android Compose previews.
 *
 * This extension provides Alphatel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Alphatel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Alphatel: Any
  get() = object {
      /** Alphatel Alphatel_T1 */
      val ALPHATEL_T1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Alphatel T1_pro */
      val T1_PRO = "spec:width=600,height=1024,unit=px,dpi=213"

  }
