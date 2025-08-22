package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IRA_Explore_More device specifications for Android Compose previews.
 *
 * This extension provides IRA_Explore_More device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IRAExploreMore.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IRAExploreMore: Any
  get() = object {
      /** IRA_Explore_More IRA_DUO_PRO_5G */
      val IRA_DUO_PRO_5G = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** IRA_Explore_More IRA_T808 */
      val IRA_T808 = "spec:width=800,height=1280,unit=px,dpi=320"

  }
